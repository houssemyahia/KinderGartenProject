package tn.esprit.spring.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable 
public class Discussion_EventPk implements Serializable {
	
	private static final long serialVersionUID = 5377539445871317492L;

	private Long idEvent;
	
	private Long idparent;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_commentaire ;

	
	
	
	public Discussion_EventPk() {
		super();
		// TODO Auto-generated constructor stub//
	}

   

	public Discussion_EventPk(Long idEvent, Long idparent, Date date_commentaire) {
		super();
		this.idEvent = idEvent;
		this.idparent = idparent;
		this.date_commentaire = date_commentaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_commentaire == null) ? 0 : date_commentaire.hashCode());
		result = prime * result + ((idEvent == null) ? 0 : idEvent.hashCode());
		result = prime * result + ((idparent == null) ? 0 : idparent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discussion_EventPk other = (Discussion_EventPk) obj;
		if (date_commentaire == null) {
			if (other.date_commentaire != null)
				return false;
		} else if (!date_commentaire.equals(other.date_commentaire))
			return false;
		if (idEvent == null) {
			if (other.idEvent != null)
				return false;
		} else if (!idEvent.equals(other.idEvent))
			return false;
		if (idparent == null) {
			if (other.idparent != null)
				return false;
		} else if (!idparent.equals(other.idparent))
			return false;
		return true;
	}

	public Long getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(Long idEvent) {
		this.idEvent = idEvent;
	}

	public Long getIdparent() {
		return idparent;
	}

	public void setIdparent(Long idparent) {
		this.idparent = idparent;
	}

	

	public Date getDate_commentaire() {
		return date_commentaire;
	}

	public void setDate_commentaire(Date date_commentaire) {
		this.date_commentaire = date_commentaire;
	}
	
	

}
