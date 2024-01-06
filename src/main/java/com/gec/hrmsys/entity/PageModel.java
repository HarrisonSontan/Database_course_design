package com.gec.hrmsys.entity;


public class PageModel {

    // 当前页码
    private int pageIndex;
    // 总记录条数
    private int totalRecordSum;
    // 每页显示多少条记录
    private int pageSize;
    // 总页数
    private int totalPageSum;

    public int getPageIndex() {

        // 当pageIndex<=1，则默认等于1
        this.pageIndex = this.pageIndex <= 1 ? 1 : this.pageIndex;
        // 当pageIndex>=总页数,则默认等于总页数 如果没有查询到 数据库有这条数据 会导致  当pageIndex为0
        this.pageIndex = this.pageIndex >= getTotalPageSum() ? getTotalPageSum() : this.pageIndex;
        this.pageIndex = this.pageIndex <= 1 ? 1 : this.pageIndex;
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getTotalRecordSum() {
        return totalRecordSum;
    }

    public void setTotalRecordSum(int totalRecordSum) {
        this.totalRecordSum = totalRecordSum;
    }

    public int getPageSize() {
        // 配置每页显示多少条记录
        this.pageSize = 3;
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPageSum() {
        // 获取总页数
        this.totalPageSum =getTotalRecordSum()%getPageSize()==0?getTotalRecordSum()/getPageSize():getTotalRecordSum()/getPageSize()+1;
        return totalPageSum;
    }

    public void setTotalPageSum(int totalPageSum) {
        this.totalPageSum = totalPageSum;
    }

    // 获取数据表查询的起始位置
    public int getStartRowNum() {
        return (getPageIndex() - 1) * getPageSize();
    }


}