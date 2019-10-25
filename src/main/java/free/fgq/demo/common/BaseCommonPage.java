package free.fgq.demo.common;

import java.io.Serializable;
import java.util.List;

/**
 * @Package: free.fgq.demo.common
 * @ClassName: BaseCommonPage
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:20
 */
public class BaseCommonPage<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 2291013630334409622L;
    protected int currentPage = 1;
    protected int pageSize = 10;
    protected long count;
    protected int pages;
    protected int index;
    private int prePage;
    private int nextPage;
    private boolean firstIs;
    private boolean lastIs;
    private List<T> list;
    private int dataPages;

    public BaseCommonPage() {
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long count) {
        this.count = count;
        if (count > 0L) {
            this.pages = (int)(this.count / (long)this.pageSize);
            if (this.count % (long)this.pageSize > 0L) {
                ++this.pages;
            }

            if (this.currentPage > this.pages) {
                this.currentPage = this.pages;
            }

            this.index = (this.currentPage - 1) * this.pageSize;
        }

    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getIndex() {
        return this.index;
    }

    public List<T> getList() {
        return this.list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPrePage() {
        return this.prePage;
    }

    public int getNextPage() {
        return this.nextPage;
    }

    public boolean isFirstIs() {
        return this.firstIs;
    }

    public boolean isLastIs() {
        return this.lastIs;
    }

    public int getDataPages() {
        return this.dataPages;
    }

    public void setDataPages(int dataPages) {
        this.dataPages = dataPages;
    }

    public void paging(int currentPage, int pageSize, long count, int pages) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.count = count;
        this.pages = pages;
        if (currentPage < 1) {
            this.currentPage = 1;
        }

        if (this.currentPage > 1) {
            this.prePage = this.currentPage - 1;
        } else {
            this.prePage = 1;
        }

        if (this.currentPage < pages) {
            this.nextPage = this.currentPage + 1;
        } else {
            this.nextPage = pages;
        }

        if (this.currentPage <= 1) {
            this.firstIs = true;
        } else {
            this.firstIs = false;
        }

        if (this.currentPage >= pages) {
            this.lastIs = true;
        } else {
            this.lastIs = false;
        }

    }
}

