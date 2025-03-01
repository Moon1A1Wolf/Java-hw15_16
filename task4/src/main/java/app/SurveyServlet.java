package app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Получаем данные из формы
        String fullName = request.getParameter("fullName");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String ageStr = request.getParameter("age");
        String gender = request.getParameter("gender");
        String subscribe = request.getParameter("subscribe");

        // Флаг ошибок
        boolean hasError = false;
        StringBuilder errorMessage = new StringBuilder();

        // Валидация ФИО
        if (fullName == null || fullName.trim().isEmpty()) {
            errorMessage.append("⚠ Please enter your full name!<br>");
            hasError = true;
        }

        // Валидация телефона (допустим, формат: +380XXXXXXXXX)
        if (phone == null || !phone.matches("^\\+380\\d{9}$")) {
            errorMessage.append("⚠ Invalid phone number! Use the format +380XXXXXXXXX.<br>");
            hasError = true;
        }

        // Валидация email
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            errorMessage.append("⚠ Invalid email!<br>");
            hasError = true;
        }

        // Валидация возраста (от 1 до 120)
        int age = 0;
        try {
            age = Integer.parseInt(ageStr);
            if (age < 1 || age > 120) {
                errorMessage.append("⚠ Age must be between 1 and 120 years!<br>");
                hasError = true;
            }
        } catch (NumberFormatException e) {
            errorMessage.append("⚠ Please enter a valid age!<br>");
            hasError = true;
        }

        // Валидация пола
        if (gender == null || (!gender.equals("male") && !gender.equals("female") && !gender.equals("other"))) {
            errorMessage.append("⚠ Please select your gender!<br>");
            hasError = true;
        }

        // Если есть ошибки, передаем их на страницу формы
        if (hasError) {
            request.setAttribute("errorMessage", errorMessage.toString());
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        // Передаем данные в JSP
        request.setAttribute("fullName", fullName);
        request.setAttribute("phone", phone);
        request.setAttribute("email", email);
        request.setAttribute("age", age);
        request.setAttribute("gender", gender);
        request.setAttribute("subscribe", subscribe != null ? "Yes" : "No");

        // Перенаправляем на страницу результата
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}