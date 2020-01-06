/**
 * 故事背景：
 *  舍罕王和他的宰相西萨·班·达依尔现在来到了当代。
 *  这次国王学乖了，他对宰相说：“这次 我不用麦子奖赏你了，我直接给你货币。
 *  另外，我也不用棋盘了，我直接给你一个固定数 额的奖赏。”
 *  宰相思考了一下，回答道：“没问题，陛下，就按照您的意愿。
 *  不过，我有个小小的要 求。那就是您能否列出所有可能的奖赏方式
 *  让我自己来选呢？假设有四种面额的钱币
 *  1 元、2 元、5 元和 10 元，而您一共给我 10 元
 *  那您可以奖赏我 1 张 10 元，或者 10 张 1 元
 *  或者 5 张 1 元外加 1 张 5 元等等
 *  如果考虑每次奖赏的金额和先后顺序 *
 *  那么最终 一共有多少种不同的奖赏方式呢？”
 */
public class Allprobability {
    public static void main(String [] args){
        //设置数额
        int a = 10;

        get(a,"");
        System.out.println("over");
    }
    private static int m = 0;

    /**
     *
     * @param num 剩余
     * @param s   缓冲字符串
     */
    private static void get(int num ,String s){
        //0 直接输出
        if(num == 0) System.out.println("第"+(++m)+"方法"+s);
        //1
        if(num>=1){
            get(num-1,s+" "+1);
        }
        //2
        if(num>=2){
            get(num-2,s+" "+2);
        }
        //5
        if(num>=5){
            get(num-5,s+" "+5);
        }
        //10
        if(num>=10){
            get(num-10,s+" "+10);
        }
    }
}
