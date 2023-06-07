import org.apache.commons.lang3.BooleanUtils;

public class BooleanUtilsExample {

	public static void main(String args[]) {
		System.out.println("BooleanUtils.isTrue(Boolean.TRUE) => " + BooleanUtils.isTrue(Boolean.TRUE)); // true
		System.out.println("BooleanUtils.isTrue(Boolean.FALSE) => " + BooleanUtils.isTrue(Boolean.FALSE)); // false
		System.out.println("BooleanUtils.isTrue(null) => " + BooleanUtils.isTrue(null)); // false
	}

}