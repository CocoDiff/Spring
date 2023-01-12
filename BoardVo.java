package kr.co.shinchen.main.model;

public class BoardVo {
	private int col_num;
	private int rownum;
	private String user_id;
	private String board_pw;
	private String title;
	private String contents;
	private String w_date;
	
	public int getCol_num() {
		return col_num;
	}
	public void setCol_num(int col_num) {
		this.col_num = col_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBoard_pw() {
		return board_pw;
	}
	public void setBoard_pw(String board_pw) {
		this.board_pw = board_pw;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getW_date() {
		return w_date;
	}
	public void setW_date(String w_date) {
		this.w_date = w_date;
	}
	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	
	
}
