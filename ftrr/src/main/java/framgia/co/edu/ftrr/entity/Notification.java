package framgia.co.edu.ftrr.entity;
// Generated Feb 12, 2019 2:57:27 PM by Hibernate Tools 5.1.10.Final

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Notifications generated by hbm2java
 */
@Entity
@Table(name = "notifications", catalog = "FTRR")
@EntityListeners(AuditingEntityListener.class)
public class Notification implements java.io.Serializable {

	private Integer id;
	private User user;
	private String content;
	private String status;
	private Integer urlId;
	private Date createdAt;
	private Date updatedAt;
	private Date readedAt;
	private User userRequest;
	private Date deletedAt;

	public Notification() {
	}

	public Notification(User user, String content, String status, Integer urlId, Date createdAt, Date updatedAt,
			Date readedAt, User userRequest, Date deletedAt) {
		this.user = user;
		this.content = content;
		this.status = status;
		this.urlId = urlId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.readedAt = readedAt;
		this.userRequest = userRequest;
		this.deletedAt = deletedAt;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUsers() {
		return this.user;
	}

	public void setUsers(User user) {
		this.user = user;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "status", length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "url_id")
	public Integer getUrlId() {
		return this.urlId;
	}

	public void setUrlId(Integer urlId) {
		this.urlId = urlId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 19)
	@CreatedDate
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 19)
	@LastModifiedDate
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "readed_at", length = 19)
	public Date getReadedAt() {
		return this.readedAt;
	}

	public void setReadedAt(Date readedAt) {
		this.readedAt = readedAt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_request")
	@CreatedBy
	public User getUserRequest() {
		return this.userRequest;
	}

	public void setUserRequest(User userRequest) {
		this.userRequest = userRequest;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 19)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

}
