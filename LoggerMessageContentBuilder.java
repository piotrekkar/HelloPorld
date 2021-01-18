import java.util.ArrayList;

public class LoggerMessageContentBuilder {
	
	private LoggerMessageContent content;
	private LoggerMessageContentData[] dataArray;
	private ArrayList<LoggerMessageContentData> dataList;

	public LoggerMessageContentBuilder() {
		this.dataList = new ArrayList<LoggerMessageContentData>();
	}

	public LoggerMessageContentBuilder insertData(LoggerMessageContentData data) {
		this.dataArray = new LoggerMessageContentData[this.dataList.size()];
		this.dataList.add(data);
		return this;
	}

	public LoggerMessageContent build() {
		this.dataArray = dataList.toArray(this.dataArray);
		this.content = new LoggerMessageContent(this.dataArray);
		return this.content;
	}
}
