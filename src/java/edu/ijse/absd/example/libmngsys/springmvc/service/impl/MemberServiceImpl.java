/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.absd.example.libmngsys.springmvc.service.impl;

import edu.ijse.absd.example.libmngsys.springmvc.dao.MemberDao;
import edu.ijse.absd.example.libmngsys.springmvc.model.Member;
import edu.ijse.absd.example.libmngsys.springmvc.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author linux
 */
@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{

    @Autowired(required = true)
    private MemberDao dao;
    
    public void saveMember(Member member) {
        dao.saveMember(member);
    }

    public Member findById(int id) {
        return dao.findById(id);
    }

    public void deleteMemberById(int id) {
       dao.deleteMemberById(id);
    }

    public List<Member> findAllMembers() {
        return dao.findAllMembers();
    }
    
}
