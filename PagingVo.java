package kr.co.shinchen.main.model;

public class PagingVo {
	private double startPage; //첫 페이지
	private double endPage;   //끝 페이지
	private int limitBlock;//최대 보일 페이지 수
	private int total;	   //전체 데이터 수
	private int nowPage;   //현재 페이지
	private int offset;	   //offset을 줘야 페이지 이동이 가능

	public double getStartPage() {
		return startPage;
	}
	public void setStartPage(double startPage) {
		this.startPage = startPage;
	}
	public double getEndPage() {
		return endPage;
	}
	public void setEndPage(double endPage) {
		this.endPage = endPage;
	}
	public int getLimitBlock() {
		return limitBlock;
	}
	public void setLimitBlock(int limitBlock) {
		this.limitBlock = limitBlock;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}	
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	public PagingVo(int nowPage, int total) {
		super();
		this.nowPage = nowPage;
		this.total = total;
		this.limitBlock = (int)Math.ceil(total / 5.0);
		this.endPage = Math.ceil(nowPage * 0.2) * 5;
		this.startPage = endPage - 4;
		this.offset = (nowPage - 1) * 5;
	}
}
