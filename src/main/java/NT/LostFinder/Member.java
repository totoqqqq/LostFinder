package NT.LostFinder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {
	@NonNull
	private String memberID;
	@NonNull
	private String memberPW;
	private String nickName;
	private String phone;
	private String email;
	private String zipcode;
	private String address;
	private String building;
	private String membership;
}