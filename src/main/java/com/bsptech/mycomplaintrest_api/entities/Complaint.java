package com.bsptech.mycomplaintrest_api.entities;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "complaint")
@XmlRootElement
public class Complaint implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @Column(name = "content")
    private String content;
    @Basic(optional = false)
    @Column(name = "like_count")
    private Integer likeCount;
    @Basic(optional = false)
    @Column(name = "disslike_count")
    private Integer disslikeCount;
    @Basic(optional = false)
    @Column(name = "publish_date")
    private Date publishDate;
    @ManyToMany
    @JoinTable(
            name = "complaint_category",
            joinColumns = @JoinColumn(name = "complaint_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories;

    public Complaint() {
    }

    public Complaint(String title, String content, Integer likeCount, Integer disslikeCount,Date publishDate, Set<Category> categories) {
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
        this.disslikeCount = disslikeCount;
        this.categories = categories;
        this.publishDate = publishDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getDisslikeCount() {
        return disslikeCount;
    }

    public void setDisslikeCount(Integer disslikeCount) {
        this.disslikeCount = disslikeCount;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
