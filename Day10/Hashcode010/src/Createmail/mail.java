package Createmail;

import java.time.LocalDateTime;

public class mail implements Comparable<mail>{
    private long mailid;
    private String from;
    private String subject;
    private String body;
    private LocalDateTime rec_time;
	public mail() {
		super();
	}
	public mail(long mailid, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailid = mailid;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}
    
    public int compareTo(mail o) {
    	    int time = o.rec_time.compareTo(this.rec_time);
    	    return time;
    }
    @Override
    public String toString() {
    	return "mail [mailid=" + mailid + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
    			+ rec_time + "]";
    }
    
}
