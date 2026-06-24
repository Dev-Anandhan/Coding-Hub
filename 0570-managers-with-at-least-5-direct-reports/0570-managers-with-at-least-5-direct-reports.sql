select m.name from employee m join employee e on m.id=e.managerID
group by m.id having count(e.id)>=5;