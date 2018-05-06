import { Component, OnInit } from '@angular/core';
import { DogService } from '../shared/dog.service';

@Component({
  selector: 'app-dog-list',
  templateUrl: './dog-list.component.html',
  styleUrls: ['./dog-list.component.css']
})
export class DogListComponent implements OnInit {
  dogs: Array<any>;

  constructor(private dogService : DogService) { }

  ngOnInit() {
    this.dogService.getAll().subscribe(data => {this.dogs = data;})
  }

}
