
public class Practice06 {

	public static void main(String[] args) {
		
		long count = 10;		//한 페이지당 보여지는 글의 수
		long totalCount = 127;	//전체 게시글 수
        long pageIndex = 2;		//현재 페이지번호
        long page = 10;			//페이지네비게이션에서 보여주는 블럭수

        Pager pager = new Pager(count, totalCount);
        pager.html(pageIndex);

	}

}
