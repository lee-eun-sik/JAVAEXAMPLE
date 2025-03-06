package Object;
import lombok.Data;
import lombok.AllArgsConstructor;

import lombok.NonNull;
@Data

@AllArgsConstructor
public class Member2 {
	
	private final String id;
	@NonNull private String name;
	private int age;
}
