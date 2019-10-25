package free.fgq.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 文件操作工具类
 */
public class FileUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);

    private static void createFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            if (file.isDirectory()) {
                file.mkdirs();
            } else {
                file.getParentFile().mkdirs();
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeStreamToFile(InputStream inputStream, String targetFilePath) throws IOException {
        FileOutputStream outputStream = null;
        try {
            File toFile = new File(targetFilePath);
            if (!toFile.exists()) {
                createFile(targetFilePath);
            }
            outputStream = new FileOutputStream(toFile);
            int byteSize = 1024;
            byte[] bytes = new byte[byteSize];
            int temp;
            while ((temp = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, temp);
            }
        } catch (FileNotFoundException e) {
            LOGGER.error("系统找不到指定路径:{}", e);
            throw e;
        } finally {
            if (outputStream != null) {
                outputStream.flush();
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /**
     * 下载文件
     *
     * @param downloadFile
     * @param response
     * @param fileName
     * @throws IOException
     */
    public static void downloadFile(File downloadFile, HttpServletResponse response, String fileName) throws IOException {
        response.addHeader("Content-Disposition", "attachment;filename=".concat(new String(fileName.getBytes("utf-8"), "iso8859-1")));
        response.setContentType("application/x-msdownload");
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            if (downloadFile.exists()) {
                int len;
                byte[] buffer = new byte[1024];
                outputStream = new BufferedOutputStream(response.getOutputStream());
                inputStream = new BufferedInputStream(new FileInputStream(downloadFile));
                while ((len = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, len);
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (null != outputStream) {
                outputStream.flush();
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /**
     * 删除文件
     *
     * @param filePath
     * @return
     */
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            boolean x = file.delete();
            LOGGER.info("删除文件：{}", x);
        }
        return true;
    }
}
