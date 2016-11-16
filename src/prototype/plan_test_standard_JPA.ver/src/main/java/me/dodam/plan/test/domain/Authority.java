package me.dodam.plan.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_AUTHORITY")
public class Authority {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AUTHORITY_SEQ")
	private Long seq;

	@Column(name="AUTHORITY_TYPE")
	@Enumerated(EnumType.STRING)
	private AuthorityType type = AuthorityType.GENERAL;
	
	@OneToOne
	@JoinColumn(name="USER_SEQ")
	private User user;

	public Long getSeq() {
		return seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public AuthorityType getType() {
		return type;
	}

	public void setType(AuthorityType type) {
		this.type = type;
	}
}
