package study.test;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Uday Kandpal
 */
@Entity
@Table(catalog = "study", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Questions.findAll", query = "SELECT q FROM Questions q"),
    @NamedQuery(name = "Questions.findByInd", query = "SELECT q FROM Questions q WHERE q.ind = :ind"),
    @NamedQuery(name = "Questions.findByText", query = "SELECT q FROM Questions q WHERE q.text = :text")})
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer ind;
    @Column(length = 10000)
    private String text;

    public Questions() {
    }

    public Questions(Integer ind) {
        this.ind = ind;
    }

    public Integer getInd() {
        return ind;
    }

    public void setInd(Integer ind) {
        this.ind = ind;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ind != null ? ind.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Questions)) {
            return false;
        }
        Questions other = (Questions) object;
        if ((this.ind == null && other.ind != null) || (this.ind != null && !this.ind.equals(other.ind))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "study.test.Questions[ ind=" + ind + " ]";
    }

}
