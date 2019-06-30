package practice.develop.blank.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SampleRequestBody {

	/** ID */
	@NotBlank
	@Size(max = 5)
	private String id;

	/** 数値 */
	@Min(0)
	@Max(100)
	private int plusNum;

}
