package q1.extract_method.refactored;

abstract class Template {
   int common(int min, int max) {
      int sum = 0;
      for (int i = min; i <= max; i++) {
          sum += apply(i);
      }
      return sum;
   }
   abstract int apply(int i);
}

class M1 extends Template {
   @Override
   int apply(int i) {
      return i;
   }
}

class M2 extends Template {
   @Override
   int apply(int i) {
	  i *= i;
      return i;
   }
}