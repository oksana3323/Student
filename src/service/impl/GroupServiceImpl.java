package service.impl;

import db.DataBase;
import model.Group;
import service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {
    public GroupServiceImpl() {

    }
        DataBase dataBase = new DataBase();

        @Override
       public String addNewGroup (Group group){
           dataBase.getGroups().add(group);
          return "succes";



        }

Group group=new Group();
    @Override
    public String getGroupById(int id) {
        dataBase.getGroups().stream()

                .filter(group -> group.equals(id));
        return "Yes";
    }

        @Override
        public List<Group> getAllGroups () {
            return  dataBase.getGroups().stream().toList();


        }

        @Override
        public String updateGroupName ( int id, String groupName){


                group.getId();
                group.setName(groupName);
                dataBase.getGroups().add(group);
                return "Group name updated successfully";


            }





    @Override
        public List<Group> filterByYear ( int year, String ascDesc){
        

            return null;
        }

        @Override
        public List<Group> sortGroupByYear (String ascDesc){
            return null;
        }

        @Override
        public void deleteGroupById ( int id){

        }


    }
