package UNUSED;

import java.math.BigDecimal;

public class UNUSED_TransformationUtil {


  public static <T, R> R applyTransformationSafely(T input, UNUSED_Transformer<T, R> transformer) {
    try {
      return transformer.transform(input);
    } catch (NumberFormatException e) {
      throw new NumberFormatException();
    }
  }

  public static final UNUSED_Transformer<String, BigDecimal> STRING_TO_BIGDECIMAL = input -> {
    try {
      return new BigDecimal(input);
    } catch (NumberFormatException e) {
      throw new NumberFormatException();
    }
  };


  public static final UNUSED_Transformer<String, Integer> STRING_TO_INTEGER = input -> {
    try {
      return Integer.parseInt(input);
    } catch (NumberFormatException e) {
      throw new NumberFormatException();
    }
  };


}
