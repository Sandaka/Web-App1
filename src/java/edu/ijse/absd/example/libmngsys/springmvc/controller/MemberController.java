/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.example.libmngsys.springmvc.controller;

import edu.ijse.absd.example.libmngsys.springmvc.model.Member;
import edu.ijse.absd.example.libmngsys.springmvc.service.MemberService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author linux
 */
@Controller

public class MemberController {

    @Autowired
    private MemberService service;

    @RequestMapping(value = {"/new"}, method = RequestMethod.GET)
    public String newMember(ModelMap modelMap) {
        Member member = new Member();
        modelMap.addAttribute("member", member);
        return "registration";
    }

    @RequestMapping(value = {"/new"}, method = RequestMethod.POST)
    public String saveMember(@Valid Member member, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "registration";
        }

        service.saveMember(member);
        model.addAttribute("id", member.getId());
        model.addAttribute("name", member.getName());
        model.addAttribute("address", member.getAddress());
        return "results";
    }

    @RequestMapping(value = {"/members"}, method = RequestMethod.GET)
    public String viewAllMember(ModelMap model) {

        List<Member> findAllMembers = service.findAllMembers();
        model.addAttribute("members", findAllMembers);
        return "ViewAllMembers";
    }

    @RequestMapping(value = {"/addMember"}, method = RequestMethod.POST)
    public String addMember(@ModelAttribute("member") Member member, ModelMap model) {
        model.addAttribute("id", member.getId());
        model.addAttribute("name", member.getName());
        model.addAttribute("address", member.getAddress());
        service.saveMember(member);
        return "results";
    }

    @RequestMapping(value = {"/findmemberById"}, method = RequestMethod.GET)
    public String findById(ModelMap modelMap) {

        Member member = new Member();
        modelMap.addAttribute("member", member);

        return "findmemberById";
    }

    @RequestMapping(value = {"/findmemberById"}, method = RequestMethod.POST)
    public String findById(@ModelAttribute("member") Member member, ModelMap model) {

        Member me = service.findById(member.getId());
        model.addAttribute("member", me);
        return "findmemberById";
    }

    @RequestMapping(value = {"/deletemember"}, method = RequestMethod.GET)
    public String deleteMember(ModelMap modelMap) {

        Member member = new Member();
        modelMap.addAttribute("member", member);

        return "deleteMember";
    }

    @RequestMapping(value = {"/deletemember"}, method = RequestMethod.POST)
    public String deleteMember(@ModelAttribute("member") Member member, ModelMap model) {

        service.deleteMemberById(member.getId());
        return "deleteMember";
    }
    
//    @RequestMapping(value = {"/edit-{id}-member"},method = RequestMethod.GET, produces = MediaType.)
//    @ResponseBody
//    public ModelMap loadMemberData(ModelMap modelMap, @PathVariable int id){
//        System.out.println("Id : "+id);
//    }
}
