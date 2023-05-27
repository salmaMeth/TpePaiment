package ecr.web.app.shared.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Uplode")
public class uplodeDTO implements Serializable {

	public uplodeDTO(Long topic, String stream, String tag, String plink,
			String fpath) {
		super();
		this.topic = topic;
		this.stream = stream;
		Tag = tag;
		this.plink = plink;
		this.fpath = fpath;
	}
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long topic;
	@Column(name = "stream")
	private String stream;
	@Column(name = "Tag")
	private String Tag;
	@Column(name = "plink")
	private String plink;
	@Column(name = "fpath")
	private String fpath;
	public Long getTopic() {
		return topic;
	}
	public void setTopic(Long topic) {
		this.topic = topic;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getTag() {
		return Tag;
	}
	public void setTag(String tag) {
		Tag = tag;
	}
	public String getPlink() {
		return plink;
	}
	public void setPlink(String plink) {
		this.plink = plink;
	}
	public String getFpath() {
		return fpath;
	}
	public void setFpath(String fpath) {
		this.fpath = fpath;
	}
	@Override
	public String toString() {
		return "uplode [topic=" + topic + ", stream=" + stream + ", Tag=" + Tag
				+ ", plink=" + plink + ", fpath=" + fpath + "]";
	}
public uplodeDTO(){}
}
