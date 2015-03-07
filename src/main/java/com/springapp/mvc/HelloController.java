package com.springapp.mvc;

import org.hibernate .Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        Session session = sessionFactory.openSession();
//        Session session = sessionFactory.getCurrentSession();

        AuditLogEntity auditlog = (AuditLogEntity) session.get(AuditLogEntity.class, 1);

        System.out.println(auditlog.getAuditName());

        model.addAttribute("message", auditlog.getAuditName());

        session.close();

        System.out.println(auditlog.getAuditName() + ":test");

		return "hello";
	}
}