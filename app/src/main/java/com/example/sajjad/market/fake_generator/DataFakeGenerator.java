package com.example.sajjad.market.fake_generator;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import com.example.sajjad.market.R;
import com.example.sajjad.market.posts.CategoryFragmentDataModel;
import com.example.sajjad.market.posts.CategoryMainPage;
import com.example.sajjad.market.posts.ProductMainPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sajjad on 4/4/2018.
 */

public class DataFakeGenerator {
    public static List<CategoryMainPage> getCategoryDataMainPage(Context context){
        List<CategoryMainPage> categories = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            CategoryMainPage category = new CategoryMainPage();
            category.setId(i);
            switch (i){
                case 1:
                    category.setProductName("کالای دیجیتال");
                    break;
                case 2:
                    category.setProductName("مد و پوشاک");
                    break;
                case 3:
                    category.setProductName("خانه، آشپزخانه و ابزار");
                    break;
                case 4:
                    category.setProductName("آرایشی و بهداشتی");
                    break;
                case 5:
                    category.setProductName("کتاب، فرهنگ و هنر");
                    break;
                case 6:
                    category.setProductName("ورزش و سفر");
                    break;

                case 7:
                    category.setProductName("مادر و کودک");
                    break;
                case 8:
                    category.setProductName("وسایل نقلیه و صنعتی");
                    break;
            }
            categories.add(category);
        }
        return categories;
    }

    public static List<ProductMainPage> getProductDataMainPage (Context context) {
        List<ProductMainPage> products = new ArrayList<>();
        String moneyUnit = " تومان";

        ProductMainPage product = new ProductMainPage();
        product.setProductImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.horse_newest_sample_image,null));
        for (int i = 1; i <= 8; i++) {
            product.setId(i);
            switch (i){
                case 1:
                    product.setContent("1 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("10,000" + moneyUnit);
                    break;
                case 2:
                    product.setContent("2 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("100,000" + moneyUnit);
                    break;
                case 3:
                    product.setContent("3 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("150,000" + moneyUnit);
                    break;
                case 4:
                    product.setContent("4 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("170,000" + moneyUnit);
                    break;
                case 5:
                    product.setContent("5 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("210,000" + moneyUnit);
                    break;
                case 6:
                    product.setContent("6 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("674,000" + moneyUnit);
                    break;
                case 7:
                    product.setContent("7 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("7,000" + moneyUnit);
                    break;
                case 8:
                    product.setContent("8 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    product.setPrice("7,658,000" + moneyUnit);
                    break;
            }
            products.add(product);

        }
        return products;
    }

    public static List<CategoryFragmentDataModel> getCategoryListData (Context context){
        List<CategoryFragmentDataModel> categoryFragmentDataModelList = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            CategoryFragmentDataModel categoryFragmentDataModel = new CategoryFragmentDataModel();
            categoryFragmentDataModel.setId(i);
            categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.mobile_category_list,null));
            switch (i){
                case 1:
                   // categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.mobile_category_list,null));
                    categoryFragmentDataModel.setCategoryName("موبایل");
                    break;
                case 2:
                   // categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.tablet_category_list,null));
                    categoryFragmentDataModel.setCategoryName("تبلت");
                    break;
                case 3:
                  //  categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.laptop_category_list,null));
                    categoryFragmentDataModel.setCategoryName("لپ تاپ");
                    break;
                case 4:
                   // categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.camera_category_list,null));
                    categoryFragmentDataModel.setCategoryName("دوربین");
                    break;
                case 5:
                   // categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.computer_equipment_category_list,null));
                    categoryFragmentDataModel.setCategoryName("تجهیزات کامپیوتر");
                    break;
                case 6:
                   // categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.sport_category_list,null));
                    categoryFragmentDataModel.setCategoryName("ورزشی");
                    break;
                case 7:
                  //  categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.perfume_category_list,null));
                    categoryFragmentDataModel.setCategoryName("ادکلن");
                    break;
                case 8:
                  //  categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.decoration_category_list,null));
                    categoryFragmentDataModel.setCategoryName("دکوراسیون");
                    break;
                case 9:
//                    categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.bathroom_category_list,null));
                    categoryFragmentDataModel.setCategoryName("حمام");
                    break;
                case 10:
                   // categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.washing_category_list,null));
                    categoryFragmentDataModel.setCategoryName("شستشو");
                    break;
                case 11:
                  //  categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.light_category_list,null));
                    categoryFragmentDataModel.setCategoryName("نور و روشنایی");
                    break;
                case 12:
                 //   categoryFragmentDataModel.setCategoryImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.food_category_list,null));
                    categoryFragmentDataModel.setCategoryName("خوراکی");
                    break;
            }
            categoryFragmentDataModelList.add(categoryFragmentDataModel);

        }
        return categoryFragmentDataModelList;
    }
}
