package TrainingAllInOne;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Projects")
public class Projects {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProID")
	private Integer PId;
	
	@Column(name="ProNAME")
	private String PName;
	
	@ManyToMany(mappedBy="projects")
	private Set<Engineers> engineers;

	public Integer getPId() {
		return PId;
	}

	public void setPId(Integer pId) {
		PId = pId;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public Set<Engineers> getEngineers() {
		return engineers;
	}

	public void setEngineers(Set<Engineers> engineers) {
		this.engineers = engineers;
	}

	public Projects( String pName) {
		super();
		//PId = pId;
		PName = pName;
	}
	
	public Projects() {}
}
