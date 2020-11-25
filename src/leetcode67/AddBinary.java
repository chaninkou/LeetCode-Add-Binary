package leetcode67;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int aIndex = a.length() - 1, bIndex = b.length() - 1, carry = 0;
        
        while(aIndex >= 0 || bIndex >= 0){
            int sum = carry;
            
            if(aIndex >= 0){
                sum += a.charAt(aIndex) - '0';
                aIndex--;
            }
            
            if(bIndex >= 0){
                sum += b.charAt(bIndex) - '0';
                bIndex--;
            }
            
            // if 1+1 = 2 % 2 which is 0
            // if 1+0 = 1 % 2 which is 1
            sb.append(sum % 2);
            
            // 1 + 1 = 2 / 2 which carry = 1
            // 1 + 0 = 1 / 2 which carry = 0
            carry = sum / 2;
        }
        
        // Case where we need to carry 1 into a new index
        if(carry != 0){
            sb.append(carry);
        }
        
        
        return sb.reverse().toString();
    }
}
