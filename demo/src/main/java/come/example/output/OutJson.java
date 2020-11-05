package come.example.output;

public class OutJson {

	String respid;
	String status;
	OutData data;
	OutError error;
	OutStatus stats;
	public OutJson(String respid, String status, OutData data, OutError error, OutStatus stats) {
		super();
		this.respid = respid;
		this.status = status;
		this.data = data;
		this.error = error;
		this.stats = stats;
	}
	public String getRespid() {
		return respid;
	}
	public void setRespid(String respid) {
		this.respid = respid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OutData getData() {
		return data;
	}
	public void setData(OutData data) {
		this.data = data;
	}
	public OutError getError() {
		return error;
	}
	public void setError(OutError error) {
		this.error = error;
	}
	public OutStatus getStats() {
		return stats;
	}
	public void setStats(OutStatus stats) {
		this.stats = stats;
	}
	
	
	
}
