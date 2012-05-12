package controllers;

import doma.AppConfig;
import doma.user.User;
import doma.user.UserDao;
import doma.user.UserDaoImpl;
import doma.user.domain.Email;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.view;
import views.html.helper.form;

import plugin.doma.Transactional;

import java.util.List;

/**
 * サンプルアプリケーションのコントローラ
 */
@Transactional(configClass = AppConfig.class)
public class Application extends Controller {
    final static Form<User> userForm = form(User.class);

    public static Result INDEX = redirect(routes.Application.index());

    /**
     * Dao
     */
    private static UserDao userDao = new UserDaoImpl();

    /**
     * ユーザー一覧
     */
    public static Result index() {
        List<User> users = userDao.select();
        userForm.fill(new User());
        return ok(index.render(userForm, users));
    }

    /**
     * ユーザー登録
     *
     */
    public static Result create() {
        Form<User> form = userForm.bindFromRequest();
        if(form.hasErrors()) {
            List<User> users = userDao.select();
            return badRequest(index.render(form, users));
        } else {
            User user = form.get();
            userDao.insert(user);
        }
        return INDEX;
    }

    /**
     * ユーザー削除
     *
     * @param id
     */
    public static Result delete(int id) {
        User user = userDao.selectById(id);
        userDao.delete(user);
        return INDEX;
    }

    /**
     * ユーザー更新表示
     *
     * @param id
     */
    public static Result view(int id) {
        User user = userDao.selectById(id);
        return ok(view.render(userForm.fill(user)));
    }

    /**
     * ユーザー更新
     *
     */
    public static Result update() {
        Form<User> form = userForm.bindFromRequest();
        if(form.hasErrors()) {
            return badRequest(view.render(form));
        } else {
            User input = form.get();
            User user = userDao.selectById(input.getId());
            user.setEmail(input.getEmail());
            user.setFullname(input.getFullname());
            userDao.update(user);
        }
        return INDEX;
    }
}