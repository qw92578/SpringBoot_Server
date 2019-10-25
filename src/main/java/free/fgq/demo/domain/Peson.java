package free.fgq.demo.domain;

/**
 * 自定义配置类
 * 
 * @author Administrator
 */
//@Component
public class Peson {
//	@Value("${free.fgq.name}")//从配置文件中加载
	private String name;
//	@Value("${free.fgq.age}")
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}