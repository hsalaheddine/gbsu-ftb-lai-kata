import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  convertForm: FormGroup;
  @Output() submitNumberOutput = new EventEmitter<number>();

  constructor(private formBuilder: FormBuilder) {}

  ngOnInit(): void {
    this.convertForm = this.formBuilder.group({
      numberToConvert: [null, Validators.required] 
    });
  }

  submitNumber(): void {
    var numberToConvert = this.convertForm.get('numberToConvert').value;
    this.submitNumberOutput.emit(numberToConvert);  
    this.convertForm.reset();
  }

  }


