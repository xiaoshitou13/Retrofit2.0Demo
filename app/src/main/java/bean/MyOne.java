package bean;

import java.util.List;

/**
 * Created by 白玉春 on 2017/11/3.
 */

public class MyOne {

    /**
     * date : 20171103
     * stories : [{"images":["https://pic3.zhimg.com/v2-bffe6cc11cf71030471fa96ba7d6e4d6.jpg"],"type":0,"id":9654951,"ga_prefix":"110318","title":"追女生时一起玩个「心跳加速」，说不定她真的会爱上你"},{"images":["https://pic2.zhimg.com/v2-48be0b855aaf3cbcd626b1d6aaa0b4f1.jpg"],"type":0,"id":9655172,"ga_prefix":"110317","title":"孙宏斌没想到，接手的乐视网还藏着 IPO 造假的「王炸」"},{"images":["https://pic4.zhimg.com/v2-8e826b79bfb2b18fb8fe2df9091be49f.jpg"],"type":0,"id":9654633,"ga_prefix":"110316","title":"这个鸟，真是能把其他单纯的动物都「忽悠瘸了」"},{"images":["https://pic3.zhimg.com/v2-7100d6acaaf61157f569ab090ca2e502.jpg"],"type":0,"id":9654050,"ga_prefix":"110315","title":"「熬鸡汤」的形容还真贴切，因为汤本来就没多少营养\u2026\u2026"},{"images":["https://pic4.zhimg.com/v2-086731f4de9de646cd08f5f49f4084d3.jpg"],"type":0,"id":9655103,"ga_prefix":"110313","title":"刚走进来时一切正常，渐渐的，氛围变得「谜幻」了起来"},{"images":["https://pic1.zhimg.com/v2-81fcb0f6a545f0203e3f2c7ac70d8cfc.jpg"],"type":0,"id":9655094,"ga_prefix":"110312","title":"苏宁不准员工上京东购物？企业有权禁止员工买竞争对手的产品吗？"},{"images":["https://pic2.zhimg.com/v2-1378c9a14ba7c0cac3e432b66d03a1d5.jpg"],"type":0,"id":9655063,"ga_prefix":"110312","title":"大误 · 你这个胡子不清爽"},{"images":["https://pic2.zhimg.com/v2-4279de3e22c0872fbfedf1cec00f3b69.jpg"],"type":0,"id":9655087,"ga_prefix":"110311","title":"- 听说在黄石国家公园杀人不犯法\r\n- 这个谣言太坑人"},{"images":["https://pic1.zhimg.com/v2-28721ca0edf40392b917a8f6ef172ed4.jpg"],"type":0,"id":9654991,"ga_prefix":"110310","title":"看起来不像地球生物，但它又确实在地球上活得好好的\u2026\u2026"},{"images":["https://pic3.zhimg.com/v2-3e635edf8ab70dd77a877a20942a73f6.jpg"],"type":0,"id":9654844,"ga_prefix":"110309","title":"猜猜看，地铁一般建在地下多深的地方？"},{"images":["https://pic2.zhimg.com/v2-692379eef7b60ee2339aa4aaf154f3b9.jpg"],"type":0,"id":9654879,"ga_prefix":"110308","title":"用上这些方法，我们找到了不少人类的未来家园"},{"images":["https://pic1.zhimg.com/v2-85a9a856e16dda69da186746a80ca704.jpg"],"type":0,"id":9654809,"ga_prefix":"110307","title":"一个研究了上百年的问题：「水泥」为什么会硬？"},{"images":["https://pic3.zhimg.com/v2-ac6d988e8eeaeacccda4627067c866de.jpg"],"type":0,"id":9655055,"ga_prefix":"110307","title":"害怕错过人工智能的年轻人：有人进速成班，有人忙着开公司，博士们跑着进BAT"},{"images":["https://pic3.zhimg.com/v2-c85e6c2a0527d2e382e63975160f27a2.jpg"],"type":0,"id":9654729,"ga_prefix":"110307","title":"在中国学艺后，这个日本人回东京开了家正宗的「兰州牛肉面」"},{"images":["https://pic4.zhimg.com/v2-27a9664362ce1c20d5d679d451beb473.jpg"],"type":0,"id":9544893,"ga_prefix":"110306","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic3.zhimg.com/v2-cf39969f72bc78cd4872286699c24576.jpg","type":0,"id":9655172,"ga_prefix":"110317","title":"孙宏斌没想到，接手的乐视网还藏着 IPO 造假的「王炸」"},{"image":"https://pic2.zhimg.com/v2-3cddee1277aa65cbe613c017d2fada9d.jpg","type":0,"id":9655094,"ga_prefix":"110312","title":"苏宁不准员工上京东购物？企业有权禁止员工买竞争对手的产品吗？"},{"image":"https://pic1.zhimg.com/v2-b56c6387d77962d207a453ec859919e0.jpg","type":0,"id":9655087,"ga_prefix":"110311","title":"- 听说在黄石国家公园杀人不犯法\r\n- 这个谣言太坑人"},{"image":"https://pic3.zhimg.com/v2-d4faed9b48616c0930623b7936d52122.jpg","type":0,"id":9654844,"ga_prefix":"110309","title":"猜猜看，地铁一般建在地下多深的地方？"},{"image":"https://pic4.zhimg.com/v2-73c51f5c469f73a05aa3f7d676d5960f.jpg","type":0,"id":9654729,"ga_prefix":"110307","title":"在中国学艺后，这个日本人回东京开了家正宗的「兰州牛肉面」"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic3.zhimg.com/v2-bffe6cc11cf71030471fa96ba7d6e4d6.jpg"]
         * type : 0
         * id : 9654951
         * ga_prefix : 110318
         * title : 追女生时一起玩个「心跳加速」，说不定她真的会爱上你
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic3.zhimg.com/v2-cf39969f72bc78cd4872286699c24576.jpg
         * type : 0
         * id : 9655172
         * ga_prefix : 110317
         * title : 孙宏斌没想到，接手的乐视网还藏着 IPO 造假的「王炸」
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
