package com.myblog.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {
	
	@Id
	@GeneratedValue
	@Column(name="postId")
	private int postId;
	
	@Column(name="postTitle")
	private String postTitle;
	
	@Column(name="post", columnDefinition = "text")
	private String post;
	
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date utilTimestamp;
	
	@Column(name="author")
	private String author;
	
	@Column(name="read")
	private int read;
	
}
