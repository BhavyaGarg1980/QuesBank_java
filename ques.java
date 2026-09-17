///// QUES 1 ...................................................................

// import java.util.*;
// class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int original = sc.nextInt();
//         double discountP = sc.nextDouble();
//         double serviceP = sc.nextDouble();

//         double discount = original * discountP / 100.0;
//         double amtafterDisc = original - discount;
//         double service = amtafterDisc * serviceP / 100.0;
//         double finalAmt = amtafterDisc + service;
//         System.out.printf("%.2f", finalAmt);
//     }
// }

//////// QUES 2  .................................................................

// import java.util.*;
// class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for(int i = 0; i < n; i++){
//             sum += arr[i];
//             if(arr[i] > max) max = arr[i];
//             if(arr[i] < min) min = arr[i];
//         }
//         double average = (double) sum / n;
//         int diff = max - min;
//         System.out.println("Sum: " + sum);
//         System.out.printf("Average: " + "%.2f", average);
//         System.out.println();
//         System.out.println(diff);
//     }
// }


// ///// QUES 3 ...................................................................

// import java.util.*;
// class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int evenSum = 0;
//         int oddSum = 0;
        
//         while(n > 0){
//             int digit = n % 10;
//             if(digit % 2 == 0){
//                 evenSum += digit;
//             } 
//             else {
//                 oddSum += digit;
//             }
//             n = n / 10;
//         }
//         System.out.println("Even Sum: " + evenSum);
//         System.out.println("Odd Sum: " + oddSum);
//     }
// }


///// QUES 4 ...................................................................

// import java.util.*;
// class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++){
//             long gram = (long) arr[i] * 1000;
//             System.out.print(gram + " ");
//         }
//     }
// }



///// QUES 5 ...................................................................

// import java.util.*;
// public class ques {

//     static class product{
//         int id;
//         double price;
//         int left;

//         product(int id, double price, int left){
//             this.id = id;
//             this.price = price;
//             this.left= left;
//         }

//         double calculateValue(){
//             return price * left;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int id = sc.nextInt();
//         double price = sc.nextDouble();
//         int left = sc.nextInt();

//         product p = new product(id, price, left);

//         System.out.printf("%.2f", p.calculateValue());
//     }
// }


///// QUES 6 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int even = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] % 2 == 0){
//                 int temp = arr[i];
//                 for(int j = i; j > even; j--){
//                     arr[j] = arr[j - 1];
//                 }
//                 arr[even] = temp;
//                 even++;
//             }
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

/// another way to do ques 6 ...................................................................
// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int[] result = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int idx = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] % 2 == 0){
//                 result[idx] = arr[i];
//                 idx++;
//             }
//         }
//         for(int i = 0; i < n; i++){
//             if(arr[i] % 2 != 0){
//                 result[idx] = arr[i];
//                 idx++;
//             }
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(result[i] + " ");
//         }
//     }
// }



//// QUES 7 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         str = str.replace(" ", "").toLowerCase();
//         int left = 0;
//         int right = str.length() - 1;
//         boolean isPalindrome = false;

//         while(left < right){
//             if(str.charAt(left) != str.charAt(right)){
//                 isPalindrome = false;
//                 break;
//             }
//             else {
//                 isPalindrome = true;
//                 left++;
//                 right--;
//             }
//         }
//         if(isPalindrome) System.out.println("Palindrome");
//         else System.out.println("Not Palindrome");
//     }
// }


///// QUES 8 ...............................................................

// import java.util.*;
// public class ques {
//     static char calculateGrade(int marks){
//         if(marks >= 90) return 'A';
//         else if(marks >= 75) return 'B';
//         else if(marks >= 60) return 'C';
//         else if(marks >= 40) return 'D';
//         else return 'F';
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0; i < n ; i++){
//             int marks = sc.nextInt();
//             char grade = calculateGrade(marks);
//             System.out.print(grade + " ");
//         }
//     }
// }


////// QUES 9 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i = 0; i < n; i++){
//             list.add(sc.nextInt());
//         }
//         int cancel = sc.nextInt();

//         list.removeIf(x -> x % cancel == 0);

//         if(list.isEmpty()) System.out.print("-1");
//         else{
//             for(int x : list){
//                 System.out.print(x + " ");
//             }
//         }
//     }
// }



////// QUES 10 ...............................................................

// using vector
// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Vector<Integer> v = new Vector<>();
//         for(int i = 0; i < n; i++){
//             v.add(sc.nextInt());
//         }
//         int existing = sc.nextInt();
//         int newid = sc.nextInt();

//         int index = v.indexOf(existing);
//         if(index == -1){
//             System.out.print("not found");
//         }
//         else{
//             v.insertElementAt(newid, index + 1);
//             for(int x : v){
//                 System.out.print(x + " ");
//             }
//         }
        
//     }
// }


///// QUES 11 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         LinkedList<Integer> list = new LinkedList<>();
//         for(int i = 0; i < n; i++){
//             list.add(sc.nextInt());
//         }
//         int remove = sc.nextInt();

//         boolean found = false;
//         for(int i = 0; i < list.size(); i++){
//             if(list.get(i) == remove){
//                 list.remove(i);
//                 found = true;
//                 break;
//             }
//         }
//         if(!found) System.out.println("not found");
//         else{
//             for(int x : list){
//                 System.out.print(x + " ");
//             }
//         }
//     }
// }


///// QUES 12 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         HashSet<Integer> set = new HashSet<>();
//         for(int i = 0; i < n; i++){
//             set.add(sc.nextInt());
//         }
//         int unique = set.size();
//         if(unique > n/2) System.out.println("high unique");
//         else System.out.println("low unique");
//     }
// }


////// QUES 13 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int i = 0; i < n; i++){
//             set.add(sc.nextInt());
//         }
//         int target = sc.nextInt();
//         Integer result = set.lower(target);
//         if(result == null) System.out.println("-1");
//         else System.out.println(result);
//     }
// }


///// QUES 14 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < n; i++){
//             int id = sc.nextInt();
//             int quantity = sc.nextInt();
//             map.put(id, quantity);
//         }
//         int m = sc.nextInt();
//         int total = 0;
//         for(int i = 0; i < m; i++){
//             int id = sc.nextInt();
//             if(map.containsKey(id)){
//                 total += map.get(id);
//             }
//         }
//         System.out.println(total);
//     }
// }


///// QUES 15 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int [n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         Arrays.sort(arr);
//         int sum = 0;
//         for(int i = 0; i < k; i++){
//             sum += arr[i];
//         }
//         System.out.print(sum);
//     }
// }

/// USING PRIORITY QUEUE

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i = 0; i < n; i++){
//             pq.add(sc.nextInt());
//         }
//         int k = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i < k; i++){
//             sum += pq.poll();
//         }
//         System.out.print(sum);
//     }
// }


////// QUES 16 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         double d = sc.nextDouble();
//         System.out.println(n);
//         System.out.printf("%.2f", d);
//     }
// }

// USING generic CLASS
// import java.util.*;
// public class ques {
//     static class Box<T>{
//         T value;
//         Box(T value){
//             this.value = value;
//         }
//         T getValue(){
//             return value;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Box<Integer> b1 = new Box<>(sc.nextInt());
//         Box<Double> b2 = new Box<>(sc.nextDouble());
//         System.out.println(b1.getValue());
//         System.out.printf("%.2f", b2.getValue());
//     }
// }


///// QUES 17 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double balance = sc.nextDouble();
//         double amount = sc.nextDouble();
//         if(amount <= 0) System.out.println("invalid amount");
//         else if(amount > balance) System.out.println("insufficient balance");
//         else{
//             balance -= amount;
//             System.out.printf("%.2f", balance);
//         }
//     }
// }


///// QUES 18 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n >= 0 && n <= 100) {
//             System.out.println(n);
//         } else {
//             System.out.println("Invalid Score");
//         }
//     }
// }


/////// QUES 19 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] marks = new int[n];
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             marks[i] = sc.nextInt();
//             sum += marks[i];
//         }
//         double avg = (double)sum / n;
//         boolean found = false;
//         for(int i = 0; i < n; i++){
//             if(marks[i] > avg){
//                 System.out.print(marks[i] + " ");
//                 found = true;
//             }
//         }
//         if(!found) System.out.print("-1");
//     }
// }


///// QUES 20 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0; i < n; i++){
//             list.add(sc.nextInt());
//         }
//         list.stream()
//             .distinct()
//             .sorted(Collections.reverseOrder())
//             .limit(3)
//             .forEach(x -> System.out.print(x + " "));
//     }
// }

// USING ARRAY
// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         int count = 0;
//         int last = -1;

//         for (int i = n - 1; i >= 0 && count < 3; i--) {
//             if (arr[i] != last) {
//                 System.out.print(arr[i] + " ");
//                 last = arr[i];
//                 count++;
//             }
//         }
//     }
// }


////// QUES 21 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int threshold = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] > threshold){
//                 sum += arr[i];
//             }
//         }
//         System.out.println(sum);
//     }
// }


///// QUES 22 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++){
//             if(arr[i] >= 1000){
//                 arr[i] = (int)Math.round(arr[i] * 0.85);
//             }
//             else{
//                 arr[i] = (int)Math.round(arr[i] * 0.95);
//             }
//         }
//         for(int i = 0; i < n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


///// QUES 23 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int high = 0;
//         int medium = 0;
//         int low = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] >= 75) high++;
//             else if(arr[i] >= 50) medium++;
//             else low++;
//         }
//         System.out.println("high:" + high);
//         System.out.println("medium:" + medium);
//         System.out.println("low:" + low);
//     }
// }


///// QUES 24 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] % 2 == 0){
//                 sum += arr[i] * arr[i];
//             }
//         }
//         System.out.println(sum);
//     }
// }


///// QUES 25 ...............................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int index = sc.nextInt();
//         int divisor = sc.nextInt();
//         if(index < 0 || index >= n) System.out.println("invalid index");
//         else if(divisor == 0) System.out.println("division by zero");
//         else{
//             System.out.println(arr[index] / divisor);
//         }
//     }
// }


///// QUES 26......................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<String> list = new ArrayList<>();
//         for(int i = 0; i < n; i++){
//             int id = sc.nextInt();
//             String book = sc.next();
//             String[] arr = book.split(",");
//             for(int j = 0; j < arr.length; j++){
//                 list.add(id + " " + arr[j]);
//             }
//         }
//         for(String x : list){
//             System.out.println(x);
//         }
//     }
// }


////// QUES 27........................................................

// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         LinkedHashMap<Integer, String> name = new LinkedHashMap<>(); //id, name
//         LinkedHashMap<Integer, Integer> count = new LinkedHashMap<>(); //id, count

//         for(int i = 0; i < n; i++){
//             int pid = sc.nextInt();
//             String pname = sc.next();
//             int tid = sc.nextInt();
//             String tname = sc.next();
//             String dname = sc.next();

//             name.put(pid, pname);
//             if(count.containsKey(pid)){
//                 count.put(pid, count.get(pid) + 1);
//             }
//             else{
//                 count.put(pid, 1);
//             }
//         }
//         for(int id : name.keySet()){
//             System.out.println(id + " " + name.get(id) + " " + count.get(id));
//         }
//     }
// }

/// USING ARRAYS
// import java.util.*;
// public class ques {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] patientId = new int[n];
//         String[] patientName = new String[n];
//         int[] count = new int[n];
//         int unique = 0;

//         for (int i = 0; i < n; i++) {
//             int id = sc.nextInt();
//             String name = sc.next();
//             int treatmentId = sc.nextInt();
//             String treatmentName = sc.next();
//             String doctorName = sc.next();

//             int index = -1;
//             for (int j = 0; j < unique; j++) {
//                 if (patientId[j] == id) {
//                     index = j;
//                     break;
//                 }
//             }
//             if (index == -1) {
//                 patientId[unique] = id;
//                 patientName[unique] = name;
//                 count[unique] = 1;
//                 unique++;
//             } else {
//                 count[index]++;
//             }
//         }
//         for (int i = 0; i < unique; i++) {
//             System.out.println(patientId[i] + " " + patientName[i] + " " + count[i]);
//         }
//     }
// }



/////// QUES 28..................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
//         // id , name + dname

//         for(int i = 0; i < n; i++){
//             int id = sc.nextInt();
//             String name = sc.next();
//             int did = sc.nextInt();
//             String dname = sc.next();

//             if(!students.containsKey(id)){
//                 students.put(id, name + " " + dname);
//             }
//         }
//         for(int id : students.keySet()){
//             System.out.println(id + " " + students.get(id));
//         }
//     }
// }


/////// QUES 29........................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
//         for(int i = 0; i < n; i++){
//             int cid = sc.nextInt();
//             int fid = sc.nextInt();
//             String fname = sc.next();
//             int roomno = sc.nextInt();

//             if(!map.containsKey(fid)){
//                 map.put(fid, fname + " " + roomno);
//             }
//         }
//         for(int id : map.keySet()){
//             System.out.println(id + " " + map.get(id));
//         }
//     }
// }


/////// QUES 30........................................................................

// import java.util.*;
// import java.time.LocalDate;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String date = sc.nextLine();
//         int totalnights = sc.nextInt();
//         int stayed = sc.nextInt();

//         LocalDate checkin = LocalDate.parse(date);
//         LocalDate checkout = checkin.plusDays(totalnights);
//         int remaining = totalnights - stayed;
//         System.out.println(checkout);
//         System.out.println(remaining);
//         System.out.println(checkout.getYear());
//         System.out.println(checkout.getMonthValue());

//     }
// }

/////// QUES 31........................................................................

// import java.util.*;
// import java.time.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String date = sc.nextLine();
//         String time = sc.nextLine();
//         int duration = sc.nextInt();

//         LocalDate examdate = LocalDate.parse(date);
//         LocalTime starttime = LocalTime.parse(time);
//         LocalDateTime start = LocalDateTime.of(examdate,starttime);
//         LocalDateTime end = start.plusMinutes(duration);

//         System.out.println(end.toLocalDate());
//         System.out.println(end.toLocalTime());
//         System.out.println(end.getYear());
//         System.out.println(end.getMonthValue());
//         System.out.println(end.getHour());
//     }
// }


///// QUES 32....................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         double[] arr = new double[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++){
//             arr[i] = arr[i] * 1.10;
//             System.out.printf("%.2f ", arr[i]);
//         }
//     }
// }



///// QUES 33...........................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++){
//             arr[i] = arr[i] * 2 + 10;
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//// QUES 34.........................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i < n; i++){
//             if(arr[i] >= 20 && arr[i] <= 80){
//                 System.out.print("safe ");
//             }
//             else{
//                 System.out.print("unsafe ");
//             }
//         }
//     }
// }


///// QUES 35.........................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] id = new int[n];
//         String[] name = new String[n];
//         for(int i = 0; i < n; i++){
//             id[i] = sc.nextInt();
//             name[i] = sc.next();
//         }
//         int searchid = sc.nextInt();
//         boolean found = false;
//         for(int i = 0; i < n; i++){
//             if(id[i] == searchid){
//                 System.out.println(name[i]);
//                 found = true;
//                 break;
//             }
//         }
//         if(!found) System.out.println("not found");
//     }
// }


//// QUES 36.......................................................................

// import java.util.*;
// import java.time.*;
// import java.time.temporal.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String startdate = sc.nextLine();
//         String enddate = sc.nextLine();
//         LocalDate start = LocalDate.parse(startdate);
//         LocalDate end = LocalDate.parse(enddate);
//         long remaining = ChronoUnit.DAYS.between(start,end);
//         System.out.print(remaining);
//     }
// }


//// QUES 37........................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         int[] arr = new int[3];
//         for(int i = 0; i < 3; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.print(a + " " + b + " " + c);
//         System.out.println();

//         for(int i = 0; i < 3; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



//// QUES 38.......................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] arr = new int[3];
//         for(int i = 0; i < 3; i++){
//             arr[i] = sc.nextInt();
//         }
//         int total = 0;
//         for(int i = 0; i < 3; i++){
//             total += arr[i];
//         }
//         System.out.print(total);
//     }
// }


//// QUES 39..........................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++){
//             String temp = new String("Temp");
//         }
//         System.gc();
//         System.out.println("garbage collection requested");
//     }
// }



////  QUES 40.................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int basic = sc.nextInt();
//         int allowance = sc.nextInt();
//         int deduct = sc.nextInt();
//         int finalS = basic + allowance - deduct;
//         System.out.print(finalS);
//     }
// }



//// QUES 41.......................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++){
//             int num = sc.nextInt();
//             System.out.print(num * num + " ");
//         }
//     }
// }


//// QUES 42............................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             int num = sc.nextInt();
//             sum += num;
//         }
//         System.out.print(sum);
//     }
// }


//// QUES 43.........................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++){
//             int temp = sc.nextInt();
//             int newtemp = temp + 2;
//             System.out.print(newtemp + " ");
//         }
//     }
// }



//// QUES 44...........................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             int quantity = sc.nextInt();
//             int price = sc.nextInt();
//             int total = quantity * price;
//             sum += total;
//         }
//         System.out.println(sum);
//     }
// }



///// QUES 45.................................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n == 0) System.out.print("0");
//         else if(n <= 2) System.out.print(n * 20);
//         else if(n > 2) System.out.print(n * 40);
//     }
// }


//// QUES 46................................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int amount = sc.nextInt();
//         int value = sc.nextInt();
//         String op = sc.next();
//         if(op.equals("ADD")){
//             System.out.println(amount + value);
//         }
//         if(op.equals("MULTIPLY")){
//             System.out.println(amount * value);
//         }
//     }
// }



///// QUES 47..................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++){
//             String name = sc.next();
//             System.out.print(name.toUpperCase() + " ");
//         }
//     }
// }



//// QUES 48...........................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int morethan50 = 0;
//         for(int i = 0; i < n; i++){
//             if(arr[i] >= 50) morethan50++;
//         }
//         System.out.println(morethan50);
//         for(int i = 0; i < n; i++){
//             arr[i] += 10;
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


///// QUES 49................................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("tickets processed: " + n);
//         System.out.println("processing completed");
//     }
// }


//// QUES 50......................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int id = sc.nextInt();
//         System.out.println("order " + id + " processing");
//     }
// }



//// QUES 51............................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 0; i < n; i++){
//             int rate = sc.nextInt();
//             System.out.println("monitoring: " + rate);
//         }
//     }
// }



///// QUES 52......................................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int initial = sc.nextInt();
//         int amt1 = sc.nextInt();
//         int amt2 = sc.nextInt();
//         if(amt1 > initial) System.out.println("insufficient balance");
//         else {
//             int rem = initial - (amt1+amt2);
//             System.out.println(rem);
//         }
//     }
// }


///// QUES 53...............................................................................

// import java.util.*;
// public class ques{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int tkt = sc.nextInt();
//         int booking = sc.nextInt();
//     }
// }