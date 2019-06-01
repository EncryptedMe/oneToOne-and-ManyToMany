package TrainingAllInOne;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Engineers")
public class Engineers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EngID")
	private Integer EId;
	
	@Column(name="EngNAME")
	private String EName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "EngineersOnProjects",joinColumns= {@JoinColumn(referencedColumnName = "EngID")},
			inverseJoinColumns= {@JoinColumn(referencedColumnName="ProID") })
	private Set<Projects> projects;

	public Integer getEId() {
		return EId;
	}

	public void setEId(Integer eId) {
		EId = eId;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public Set<Projects> getProjects() {
		return projects;
	}

	public void setProjects(Set<Projects> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Engineers [EId=" + EId + ", EName=" + EName + ", projects=" + projects + "]";
	}

	public Engineers(String eName, Set<Projects> projects) {
		super();
		EName = eName;
		this.projects = projects;
	}
	
	public Engineers() {}
	
}
