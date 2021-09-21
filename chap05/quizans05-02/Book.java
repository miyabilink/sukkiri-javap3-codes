import org.apache.commons.lang3.builder.*;
import java.util.*;

public class Book implements Comparable<Book>, Cloneable {
  private String title;
  private Date publishDate;
  private String commnet;

  public int hashCode() {
      return HashCodeBuilder.reflectionHashCode(this);
  }
  public boolean equals(Object o) {
      return EqualsBuilder.reflectionEquals(this, o);
  }
  public int compareTo(Book o) {
      return CompareToBuilder.reflectionCompare(this, o);
  }

  public Book clone() {
    Book b = new Book();
    b.title = this.title;
    b.commnet = this.commnet;
    b.publishDate = (Date)this.publishDate.clone();
    return b;
  }

  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public Date getPublishData() {
    return this.publishDate;
  }
  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }
  public String getComment() {
    return this.commnet;
  }
  public void setComment(String commnet) {
    this.commnet = commnet;
  }
}
