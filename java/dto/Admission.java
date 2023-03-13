package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Admission {
  @Id
  private int idno;
  private String email;
  
  @ManyToOne
  Branches brr;
  
public Branches getBrr() {
	return brr;
}
public void setBrr(Branches brr) {
	this.brr = brr;
}
public int getIdno() {
	return idno;
}
public void setIdno(int idno) {
	this.idno = idno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
 
}
