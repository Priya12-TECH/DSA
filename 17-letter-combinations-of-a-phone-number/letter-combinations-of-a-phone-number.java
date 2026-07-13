class Solution {

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return pad("", digits);
    }

    public static ArrayList<String> pad(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        if (digit == 7) {

            for (int i = 15; i <= 18; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad(p + ch, up.substring(1)));
            }

        } else if (digit == 8) {

            for (int i = 19; i <= 21; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad(p + ch, up.substring(1)));
            }

        } else if (digit == 9) {

            for (int i = 22; i <= 25; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad(p + ch, up.substring(1)));
            }

        } else {

            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(pad(p + ch, up.substring(1)));
            }
        }

        return list;
    }
}