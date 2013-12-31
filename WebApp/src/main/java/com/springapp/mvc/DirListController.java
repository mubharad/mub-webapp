package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FilenameFilter;

@Controller
@RequestMapping("/")
public class DirListController extends AbstractController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getDirList() {
        //return back to index.jsp
        File[] files = getPdfFileListing();
        ModelAndView model = new ModelAndView("index");
        model.addObject("dir", files);

        return model;
	}

    private File[] getPdfFileListing() {
        File dir = new File("//Users//murali//Documents"); // current directory

        return dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".pdf");
            }
        });
    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}