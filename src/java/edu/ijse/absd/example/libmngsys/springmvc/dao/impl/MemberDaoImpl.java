/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.example.libmngsys.springmvc.dao.impl;

import edu.ijse.absd.example.libmngsys.springmvc.dao.AbstractDao;
import edu.ijse.absd.example.libmngsys.springmvc.dao.MemberDao;
import edu.ijse.absd.example.libmngsys.springmvc.model.Member;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author linux
 */
@Repository("memberDao")
public class MemberDaoImpl extends AbstractDao<Integer, Member> implements MemberDao {

    public void saveMember(Member member) {
        persist(member);
    }

    public Member findById(int id) {
        return (Member)getByKey(id);
    }

    public void deleteMemberById(int id) {
        Query query = getSession().createSQLQuery("delete from Member where id=:id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    public List<Member> findAllMembers() {
        Criteria crt = createEntityCriteria();
        return (List<Member>) crt.list();
    }

}
