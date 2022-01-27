import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Pager {

	static long count = 0;
	static long totalCount = 0;
	static long pageIndex = 0;

	public Pager(long count, long totalCount) {
		this.count = count;
		this.totalCount = totalCount;
	}

	public static void html(long pageIndex) {
		
		long totalPage = totalCount/count + (totalCount%count > 0 ? 1 : 0);

		try {
			File file = new File("property.html");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("<head>");
			writer.write("<meta charset=\\\"UTF-8\\\"/>");
			writer.write("<style>");
			writer.write(".on { color : red }");
			writer.write("</style>");
			writer.write("</head>");
			writer.write("<body>");
			writer.write("<a href = '#'>[처음]</a>");
			writer.write("<a href = '#'>[이전]</a>");

			for (int i = 1; i <= totalPage; i++) {
				if (pageIndex == i) {
					writer.write("<a href = '#' class='on'>[" + i + "]</a>");
				} else {
					writer.write("<a href = '#'>[" + i + "]</a>");
				}
			}

			writer.write("<a href = '#'>[다음]</a>");
			writer.write("<a href = '#'>[마지막]</a>");
			writer.write("</body>");
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
