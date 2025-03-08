package Object;
import lombok.Data;
import lombok.NonNull;
@Data

public class Member2 {
	private String id;
	@NonNull private String name;
	private int age;
}