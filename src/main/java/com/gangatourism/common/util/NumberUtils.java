package com.gangatourism.common.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

@UtilityClass
public class NumberUtils {

  public static Double toDouble(final String value) {
    return StringUtils.isNotBlank(value) ? Double.valueOf(value) : null;
  }
}
