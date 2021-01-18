import java.util.ArrayList;

public class PrinterContentBuilder {
	private PrinterContent content;
	private PrinterContentData[] dataArray;
	private ArrayList<PrinterContentData> dataList;

	public PrinterContentBuilder() {
		this.dataList = new ArrayList<PrinterContentData>();
	}

	public PrinterContentBuilder insertData(PrinterContentData data) {
		this.dataArray = new PrinterContentData[this.dataList.size()];
		this.dataList.add(data);
		return this;
	}

	public PrinterContent build() {
		this.dataArray = dataList.toArray(this.dataArray);
		this.content = new PrinterContent(this.dataArray);
		return this.content;
	}
}
