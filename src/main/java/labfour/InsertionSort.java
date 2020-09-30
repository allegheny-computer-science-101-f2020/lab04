package labfour;

/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    source Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class InsertionSort {

  /** Insertion-sort of an array of chars into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public static char[] sort(char[] source) {
    int length = source.length;
    char[] sorted = new char[source.length];
    int begin = 0;
    // TODO: Step 1: Call System.arraycopy to create shallow clone in sorted array
    // TODO: Step 2: Use the insertion sort algorithm to sort the array
    // TODO: Step 3: Once the sorted array is correct, return it to calling method
    return sorted;
  }

  /** Insertion-sort of an array of ints into a nondecreasing order. This
   * implementation of the sort method makes a complete copy of the input array,
   * thus ensuring that it does not modify the input parameter.
   *
   * <p>Please refer to this site:
   * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html
   * for more details about the System.arraycopy() method.
   *
   * @param source the source array that will be copied and sorted
   * @return the copied and sorted array in a nondecreasing order
   */
  public static int[] sort(int[] source) {
    int length = source.length;
    int[] sorted = new int[source.length];
    int begin = 0;
    // TODO: Step 1: Call System.arraycopy to create shallow clone in "sorted"
    // TODO: Step 2: Use insertion sort algorithm to sort the array
    // TODO: Step 3: Once the sorted array is correct, return it to calling method
    return sorted;
  }

  /** Demonstrate the use of the InsertionSort algorithm. */
  public static void main(String[] args) {
    char[] letters = {'C', 'E', 'B', 'D', 'A', 'I', 'J', 'L', 'K', 'H', 'G', 'F'};
    // TODO: Step 1: call the sort method to perform an insertion sort
    int[] numbers = {1, 2, 4, 4, 9, 10, -10, 3, 8, 7, 20, 0};
    // TODO: Step 2: call the sort method to perform an insertion sort
    //
    // TODO: Make sure that you use println statements to create correct output
    // TODO: Your println methods should call the toString method in java.util.Arrays
    // TODO: Make sure that you understand how this approach to array printing works
  }
}
