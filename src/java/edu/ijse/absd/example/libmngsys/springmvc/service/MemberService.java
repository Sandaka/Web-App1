/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.example.libmngsys.springmvc.service;

import edu.ijse.absd.example.libmngsys.springmvc.model.Member;
import java.util.List;

/**
 *
 * @author linux
 */
public interface MemberService {

    public Member findById(int id);

    public void deleteMemberById(int id);

    public List<Member> findAllMembers();

    public void saveMember(Member member);
}
