package com.epam.brest.web_app;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class AnimalController {

         /**
         * Goto animals list page.
         *
         * @return view name
         */
        @GetMapping(value = "/animals")
        public final String animals(Model model) {
            return "animals";
        }

        /**
         * Goto edit animals page.
         *
         * @return view name
         */
        @GetMapping(value = "/animal/{id}")
        public final String gotoEditAnimalsPage(@PathVariable Integer id, Model model) {
            return "animals";
        }

        /**
         * Goto new animals page.
         *
         * @return view name
         */
        @GetMapping(value = "/animal/add")
        public final String gotoAddAnimalsPage(Model model) {
            return "animals";
        }
    }
