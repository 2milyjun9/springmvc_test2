package com.junefw.infra.modules.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService{
   
   @Autowired
   CodeDao dao;
   
   @Override   // service에서 상속받은 내용을 무조건 구현해야함. ServiceImpl에서는 dao 호출
   public List<Code> selectList() throws Exception {
      return dao.selectList(); 
   }
   

}