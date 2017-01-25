package hospital;

public abstract class Treatment {
	protected int treatId, docId, patId;
	
	public void setTreatId(int treatId){
		this.treatId = treatId;
	}
	public int getTreatId(){
		return treatId;
	}
	public void setDocId(int docId){
		this.docId = docId;
	}
	public int getDocId(){
		return docId;
	}
	public void setPatId(int patId){
		this.patId = patId;
	}
	public int getPatId(){
		return patId;
	}
	public abstract String treat();
}
