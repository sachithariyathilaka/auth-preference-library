package io.github.sachithariyathilaka;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import io.github.sachithariyathilaka.resource.Header;
import io.github.sachithariyathilaka.resource.UserDetail;

/**
 * Main class for the library.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
public class AuthPreference {

    /**
     * Static method for save user details.
     *
     * @param   context the context
     * @param   userDetail the user details
     */
    public static void saveUserDetails(Context context, UserDetail userDetail) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("User", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userId", userDetail.getUserId());
        editor.putBoolean("status", userDetail.isStatus());

        editor.apply();
    }

    /**
     * Static method for save user headers.
     *
     * @param   context the context
     * @param   headers the header list
     */
    public static void saveHeaders(Context context, List<Header> headers) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("User", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        for (Header header: headers)
            editor.putString(header.getName(), header.getValue());

        editor.apply();
    }

    /**
     * Static method for get user details.
     *
     * @param   context the context
     *
     * @return  the user details
     */
    public static UserDetail getUserDetails(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        return new UserDetail(
                sharedPreferences.getString("userId", ""),
                sharedPreferences.getBoolean("status", false));
    }

    /**
     * Static method for get user headers.
     *
     * @param   context the context
     * @param   headerNames the header names
     *
     * @return  the headers
     */
    public static List<Header> getHeaders(Context context, List<String> headerNames) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("User", Context.MODE_PRIVATE);
        List<Header> headers = new ArrayList<>();

        for(String headerName: headerNames)
            headers.add(new Header(
                    headerName,
                    sharedPreferences.getString(headerName, "")));

        return headers;
    }
}
