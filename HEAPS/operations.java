import java.util.*;

class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    // 🔹 INSERT (add)
    public void add(int data) {
        arr.add(data);

        int x = arr.size() - 1;

        while (x > 0) {
            int par = (x - 1) / 2;

            if (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
            } else {
                break;
            }
        }
    }

    // 🔹 PEEK
    public int peek() {
        if (arr.size() == 0) return -1;
        return arr.get(0);
    }

    // 🔹 REMOVE
    public int remove() {
        if (arr.size() == 0) return -1;

        int data = arr.get(0);

        // swap first & last
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        // delete last
        arr.remove(arr.size() - 1);

        // heapify
        heapify(0);

        return data;
    }

    // 🔹 HEAPIFY 
    private void heapify(int i) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int minIdx = i;


       // 🔸 check left child
      // agar left exist karta hai aur wo current se chhota hai
        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;  // left ko smallest maan lo
        }

      // 🔸 check right child
     // agar right exist karta hai aur wo current smallest se bhi chhota hai
        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;  // right ko smallest maan lo
        }

      // 🔸 agar smallest current node nahi hai
        if (minIdx != i) {

          // swap current node with smallest child
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }
}
