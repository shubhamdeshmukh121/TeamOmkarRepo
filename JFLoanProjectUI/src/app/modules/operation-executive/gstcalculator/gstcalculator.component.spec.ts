import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GstcalculatorComponent } from './gstcalculator.component';

describe('GstcalculatorComponent', () => {
  let component: GstcalculatorComponent;
  let fixture: ComponentFixture<GstcalculatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GstcalculatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GstcalculatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
