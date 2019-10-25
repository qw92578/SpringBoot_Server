package free.fgq.demo.common;

/**
 * @Package: free.fgq.demo.common
 * @ClassName: BasePageDto
 * @Author: fgq
 * @Description:
 * @Date: 2019/10/25 16:20
 */
public class BasePageDto {
    private Integer pageSize;
    private Integer pageNum;
    private Integer startRow;
    private Integer endRow;
    private Long total;

    public BasePageDto() {
    }

    public Integer getStartRow() {
        return this.startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getEndRow() {
        return this.endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
